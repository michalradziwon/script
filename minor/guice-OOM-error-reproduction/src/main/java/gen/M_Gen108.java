
  package gen;
  public class M_Gen108 {
  		@com.google.inject.Inject
  		public M_Gen108(M_Gen109 m_gen109){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen109 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  