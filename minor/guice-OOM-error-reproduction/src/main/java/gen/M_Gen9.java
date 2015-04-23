
  package gen;
  public class M_Gen9 {
  		@com.google.inject.Inject
  		public M_Gen9(M_Gen10 m_gen10){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen10 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  