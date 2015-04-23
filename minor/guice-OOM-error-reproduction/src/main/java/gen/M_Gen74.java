
  package gen;
  public class M_Gen74 {
  		@com.google.inject.Inject
  		public M_Gen74(M_Gen75 m_gen75){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen75 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  