
  package gen;
  public class M_Gen70 {
  		@com.google.inject.Inject
  		public M_Gen70(M_Gen71 m_gen71){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen71 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  