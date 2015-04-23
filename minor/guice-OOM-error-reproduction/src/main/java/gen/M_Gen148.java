
  package gen;
  public class M_Gen148 {
  		@com.google.inject.Inject
  		public M_Gen148(M_Gen149 m_gen149){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen149 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  