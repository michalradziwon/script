
  package gen;
  public class M_Gen5 {
  		@com.google.inject.Inject
  		public M_Gen5(M_Gen6 m_gen6){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen6 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  