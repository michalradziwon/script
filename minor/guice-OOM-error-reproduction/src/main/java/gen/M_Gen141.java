
  package gen;
  public class M_Gen141 {
  		@com.google.inject.Inject
  		public M_Gen141(M_Gen142 m_gen142){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen142 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  