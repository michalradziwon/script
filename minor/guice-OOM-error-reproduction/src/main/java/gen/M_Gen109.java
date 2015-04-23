
  package gen;
  public class M_Gen109 {
  		@com.google.inject.Inject
  		public M_Gen109(M_Gen110 m_gen110){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen110 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  