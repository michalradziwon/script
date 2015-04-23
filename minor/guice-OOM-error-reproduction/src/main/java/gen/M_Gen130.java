
  package gen;
  public class M_Gen130 {
  		@com.google.inject.Inject
  		public M_Gen130(M_Gen131 m_gen131){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen131 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  