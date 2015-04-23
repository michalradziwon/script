
  package gen;
  public class M_Gen129 {
  		@com.google.inject.Inject
  		public M_Gen129(M_Gen130 m_gen130){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen130 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  