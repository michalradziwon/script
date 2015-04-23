
  package gen;
  public class M_Gen8 {
  		@com.google.inject.Inject
  		public M_Gen8(M_Gen9 m_gen9){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen9 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  