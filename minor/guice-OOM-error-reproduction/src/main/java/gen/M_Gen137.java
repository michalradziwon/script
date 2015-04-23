
  package gen;
  public class M_Gen137 {
  		@com.google.inject.Inject
  		public M_Gen137(M_Gen138 m_gen138){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen138 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  