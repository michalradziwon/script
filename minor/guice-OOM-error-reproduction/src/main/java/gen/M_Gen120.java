
  package gen;
  public class M_Gen120 {
  		@com.google.inject.Inject
  		public M_Gen120(M_Gen121 m_gen121){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen121 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  