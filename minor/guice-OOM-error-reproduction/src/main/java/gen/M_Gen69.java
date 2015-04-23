
  package gen;
  public class M_Gen69 {
  		@com.google.inject.Inject
  		public M_Gen69(M_Gen70 m_gen70){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen70 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  