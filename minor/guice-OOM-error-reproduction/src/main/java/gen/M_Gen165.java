
  package gen;
  public class M_Gen165 {
  		@com.google.inject.Inject
  		public M_Gen165(M_Gen166 m_gen166){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen166 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  