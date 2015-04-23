
  package gen;
  public class M_Gen49 {
  		@com.google.inject.Inject
  		public M_Gen49(M_Gen50 m_gen50){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen50 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  