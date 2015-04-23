
  package gen;
  public class M_Gen71 {
  		@com.google.inject.Inject
  		public M_Gen71(M_Gen72 m_gen72){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen72 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  