
  package gen;
  public class M_Gen97 {
  		@com.google.inject.Inject
  		public M_Gen97(M_Gen98 m_gen98){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen98 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  