
  package gen;
  public class M_Gen77 {
  		@com.google.inject.Inject
  		public M_Gen77(M_Gen78 m_gen78){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen78 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  