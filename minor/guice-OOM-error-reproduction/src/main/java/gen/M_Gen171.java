
  package gen;
  public class M_Gen171 {
  		@com.google.inject.Inject
  		public M_Gen171(M_Gen172 m_gen172){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen172 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  