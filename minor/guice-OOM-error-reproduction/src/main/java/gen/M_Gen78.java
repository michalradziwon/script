
  package gen;
  public class M_Gen78 {
  		@com.google.inject.Inject
  		public M_Gen78(M_Gen79 m_gen79){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen79 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  