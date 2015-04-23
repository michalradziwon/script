
  package gen;
  public class M_Gen86 {
  		@com.google.inject.Inject
  		public M_Gen86(M_Gen87 m_gen87){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen87 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  