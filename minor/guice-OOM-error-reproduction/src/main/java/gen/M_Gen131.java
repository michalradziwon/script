
  package gen;
  public class M_Gen131 {
  		@com.google.inject.Inject
  		public M_Gen131(M_Gen132 m_gen132){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen132 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  