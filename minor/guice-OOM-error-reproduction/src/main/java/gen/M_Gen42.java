
  package gen;
  public class M_Gen42 {
  		@com.google.inject.Inject
  		public M_Gen42(M_Gen43 m_gen43){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen43 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  