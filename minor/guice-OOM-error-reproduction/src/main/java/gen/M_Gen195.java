
  package gen;
  public class M_Gen195 {
  		@com.google.inject.Inject
  		public M_Gen195(M_Gen196 m_gen196){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen196 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  