
  package gen;
  public class M_Gen175 {
  		@com.google.inject.Inject
  		public M_Gen175(M_Gen176 m_gen176){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen176 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  