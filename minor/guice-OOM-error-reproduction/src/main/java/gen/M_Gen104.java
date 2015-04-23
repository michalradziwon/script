
  package gen;
  public class M_Gen104 {
  		@com.google.inject.Inject
  		public M_Gen104(M_Gen105 m_gen105){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen105 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  