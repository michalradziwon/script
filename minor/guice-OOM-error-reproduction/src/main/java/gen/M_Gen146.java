
  package gen;
  public class M_Gen146 {
  		@com.google.inject.Inject
  		public M_Gen146(M_Gen147 m_gen147){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen147 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  