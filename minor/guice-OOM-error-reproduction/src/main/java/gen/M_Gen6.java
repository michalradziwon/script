
  package gen;
  public class M_Gen6 {
  		@com.google.inject.Inject
  		public M_Gen6(M_Gen7 m_gen7){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen7 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  