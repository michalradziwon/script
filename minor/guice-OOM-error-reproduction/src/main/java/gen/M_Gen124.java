
  package gen;
  public class M_Gen124 {
  		@com.google.inject.Inject
  		public M_Gen124(M_Gen125 m_gen125){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen125 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  