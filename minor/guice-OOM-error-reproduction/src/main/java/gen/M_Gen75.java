
  package gen;
  public class M_Gen75 {
  		@com.google.inject.Inject
  		public M_Gen75(M_Gen76 m_gen76){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen76 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  