
  package gen;
  public class M_Gen135 {
  		@com.google.inject.Inject
  		public M_Gen135(M_Gen136 m_gen136){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen136 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  