
  package gen;
  public class M_Gen127 {
  		@com.google.inject.Inject
  		public M_Gen127(M_Gen128 m_gen128){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen128 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  