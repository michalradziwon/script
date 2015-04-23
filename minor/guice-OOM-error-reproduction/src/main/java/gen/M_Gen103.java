
  package gen;
  public class M_Gen103 {
  		@com.google.inject.Inject
  		public M_Gen103(M_Gen104 m_gen104){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen104 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  