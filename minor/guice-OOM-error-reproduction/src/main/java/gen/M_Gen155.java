
  package gen;
  public class M_Gen155 {
  		@com.google.inject.Inject
  		public M_Gen155(M_Gen156 m_gen156){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen156 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  