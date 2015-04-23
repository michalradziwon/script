
  package gen;
  public class M_Gen160 {
  		@com.google.inject.Inject
  		public M_Gen160(M_Gen161 m_gen161){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen161 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  