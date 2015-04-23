
  package gen;
  public class M_Gen90 {
  		@com.google.inject.Inject
  		public M_Gen90(M_Gen91 m_gen91){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen91 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  