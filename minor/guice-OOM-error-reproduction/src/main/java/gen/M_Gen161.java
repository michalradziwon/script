
  package gen;
  public class M_Gen161 {
  		@com.google.inject.Inject
  		public M_Gen161(M_Gen162 m_gen162){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen162 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  