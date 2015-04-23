
  package gen;
  public class M_Gen138 {
  		@com.google.inject.Inject
  		public M_Gen138(M_Gen139 m_gen139){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen139 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  