
  package gen;
  public class M_Gen136 {
  		@com.google.inject.Inject
  		public M_Gen136(M_Gen137 m_gen137){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen137 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  