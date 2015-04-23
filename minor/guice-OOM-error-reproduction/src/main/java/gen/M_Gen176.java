
  package gen;
  public class M_Gen176 {
  		@com.google.inject.Inject
  		public M_Gen176(M_Gen177 m_gen177){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen177 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  