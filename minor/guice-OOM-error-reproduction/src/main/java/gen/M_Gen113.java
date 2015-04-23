
  package gen;
  public class M_Gen113 {
  		@com.google.inject.Inject
  		public M_Gen113(M_Gen114 m_gen114){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen114 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  