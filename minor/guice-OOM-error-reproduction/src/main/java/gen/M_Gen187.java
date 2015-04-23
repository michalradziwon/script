
  package gen;
  public class M_Gen187 {
  		@com.google.inject.Inject
  		public M_Gen187(M_Gen188 m_gen188){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen188 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  