
  package gen;
  public class M_Gen45 {
  		@com.google.inject.Inject
  		public M_Gen45(M_Gen46 m_gen46){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen46 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  