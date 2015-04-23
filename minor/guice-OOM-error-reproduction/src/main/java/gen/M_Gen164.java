
  package gen;
  public class M_Gen164 {
  		@com.google.inject.Inject
  		public M_Gen164(M_Gen165 m_gen165){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen165 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  