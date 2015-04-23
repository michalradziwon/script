
  package gen;
  public class M_Gen22 {
  		@com.google.inject.Inject
  		public M_Gen22(M_Gen23 m_gen23){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen23 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  