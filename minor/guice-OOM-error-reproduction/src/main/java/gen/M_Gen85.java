
  package gen;
  public class M_Gen85 {
  		@com.google.inject.Inject
  		public M_Gen85(M_Gen86 m_gen86){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen86 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  