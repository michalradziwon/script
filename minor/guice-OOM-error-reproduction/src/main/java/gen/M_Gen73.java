
  package gen;
  public class M_Gen73 {
  		@com.google.inject.Inject
  		public M_Gen73(M_Gen74 m_gen74){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen74 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  