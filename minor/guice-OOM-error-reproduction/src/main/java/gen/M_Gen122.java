
  package gen;
  public class M_Gen122 {
  		@com.google.inject.Inject
  		public M_Gen122(M_Gen123 m_gen123){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen123 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  