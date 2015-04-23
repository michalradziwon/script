
  package gen;
  public class M_Gen106 {
  		@com.google.inject.Inject
  		public M_Gen106(M_Gen107 m_gen107){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen107 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  