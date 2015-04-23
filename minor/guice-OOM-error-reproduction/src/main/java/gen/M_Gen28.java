
  package gen;
  public class M_Gen28 {
  		@com.google.inject.Inject
  		public M_Gen28(M_Gen29 m_gen29){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen29 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  