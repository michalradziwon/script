
  package gen;
  public class M_Gen105 {
  		@com.google.inject.Inject
  		public M_Gen105(M_Gen106 m_gen106){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen106 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  