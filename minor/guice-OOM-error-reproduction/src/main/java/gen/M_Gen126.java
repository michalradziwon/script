
  package gen;
  public class M_Gen126 {
  		@com.google.inject.Inject
  		public M_Gen126(M_Gen127 m_gen127){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen127 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  