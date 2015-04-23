
  package gen;
  public class M_Gen38 {
  		@com.google.inject.Inject
  		public M_Gen38(M_Gen39 m_gen39){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen39 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  