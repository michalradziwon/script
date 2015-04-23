
  package gen;
  public class M_Gen196 {
  		@com.google.inject.Inject
  		public M_Gen196(M_Gen197 m_gen197){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen197 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  